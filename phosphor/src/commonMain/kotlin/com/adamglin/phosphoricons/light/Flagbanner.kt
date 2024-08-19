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

public val LightGroup.Flagbanner: ImageVector
    get() {
        if (_flagbanner != null) {
            return _flagbanner!!
        }
        _flagbanner = Builder(name = "Flagbanner", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(237.07f, 52.8f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 232.0f, 50.0f)
                horizontalLineTo(40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -4.24f, 10.24f)
                lineTo(79.51f, 104.0f)
                lineTo(35.76f, 147.76f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 40.0f, 158.0f)
                horizontalLineTo(176.78f)
                lineToRelative(-30.2f, 63.42f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 10.84f, 5.16f)
                lineToRelative(80.0f, -168.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 237.07f, 52.8f)
                close()
                moveTo(182.5f, 146.0f)
                horizontalLineToRelative(-128.0f)
                lineToRelative(37.75f, -37.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -8.48f)
                lineTo(54.49f, 62.0f)
                horizontalLineToRelative(168.0f)
                close()
            }
        }
        .build()
        return _flagbanner!!
    }

private var _flagbanner: ImageVector? = null
