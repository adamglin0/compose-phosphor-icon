package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.Pushpinsimpleslash: ImageVector
    get() {
        if (_pushpinsimpleslash != null) {
            return _pushpinsimpleslash!!
        }
        _pushpinsimpleslash = Builder(name = "Pushpinsimpleslash", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.88f, 207.93f)
                lineToRelative(-160.0f, -176.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, false, 39.12f, 48.07f)
                lineTo(62.0f, 73.19f)
                lineTo(45.93f, 164.0f)
                horizontalLineTo(40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(76.0f)
                verticalLineToRelative(52.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                verticalLineTo(188.0f)
                horizontalLineToRelative(26.33f)
                lineToRelative(32.79f, 36.07f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.76f, -16.14f)
                close()
                moveTo(70.3f, 164.0f)
                lineTo(82.37f, 95.64f)
                lineTo(144.51f, 164.0f)
                close()
                moveTo(90.06f, 40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, -12.0f)
                horizontalLineTo(192.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                horizontalLineToRelative(-1.7f)
                lineToRelative(15.33f, 86.84f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -9.73f, 13.91f)
                arcToRelative(12.59f, 12.59f, 0.0f, false, true, -2.1f, 0.18f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 182.0f, 143.0f)
                lineTo(165.93f, 52.0f)
                horizontalLineTo(102.06f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 90.06f, 40.0f)
                close()
            }
        }
        .build()
        return _pushpinsimpleslash!!
    }

private var _pushpinsimpleslash: ImageVector? = null
