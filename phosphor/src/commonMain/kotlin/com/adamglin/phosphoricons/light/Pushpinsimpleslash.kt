package com.adamglin.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.LightGroup

public val LightGroup.Pushpinsimpleslash: ImageVector
    get() {
        if (_pushpinsimpleslash != null) {
            return _pushpinsimpleslash!!
        }
        _pushpinsimpleslash = Builder(name = "Pushpinsimpleslash", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(85.25f, 40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -6.0f)
                lineTo(192.0f, 34.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                horizontalLineToRelative(-8.85f)
                lineToRelative(19.17f, 108.64f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -4.86f, 7.0f)
                arcToRelative(5.41f, 5.41f, 0.0f, false, true, -1.05f, 0.1f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.9f, -5.0f)
                lineTo(171.0f, 46.0f)
                lineTo(91.25f, 46.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 85.25f, 40.0f)
                close()
                moveTo(212.0f, 220.44f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.48f, -0.4f)
                lineTo(169.0f, 182.0f)
                lineTo(134.0f, 182.0f)
                verticalLineToRelative(58.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(122.0f, 182.0f)
                lineTo(40.0f, 182.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                lineTo(51.0f, 170.0f)
                lineTo(68.38f, 71.33f)
                lineTo(43.56f, 44.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 52.44f, 36.0f)
                lineToRelative(160.0f, 176.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 212.0f, 220.44f)
                close()
                moveTo(158.0f, 170.0f)
                lineTo(78.58f, 82.56f)
                lineTo(63.15f, 170.0f)
                close()
            }
        }
        .build()
        return _pushpinsimpleslash!!
    }

private var _pushpinsimpleslash: ImageVector? = null
