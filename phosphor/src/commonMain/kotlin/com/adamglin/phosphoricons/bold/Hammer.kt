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

public val BoldGroup.Hammer: ImageVector
    get() {
        if (_hammer != null) {
            return _hammer!!
        }
        _hammer = Builder(name = "Hammer", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(250.18f, 105.17f)
                lineTo(186.71f, 41.25f)
                arcToRelative(100.11f, 100.11f, 0.0f, false, false, -141.43f, 0.0f)
                lineToRelative(-0.13f, 0.14f)
                lineTo(31.37f, 55.61f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 17.24f, 16.7f)
                lineTo(62.32f, 58.16f)
                arcTo(75.68f, 75.68f, 0.0f, false, true, 77.49f, 46.43f)
                lineTo(119.0f, 88.0f)
                lineTo(25.85f, 181.16f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 0.0f, 28.29f)
                lineToRelative(20.69f, 20.69f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 28.28f, 0.0f)
                lineTo(168.0f, 137.0f)
                lineToRelative(1.51f, 1.51f)
                horizontalLineToRelative(0.0f)
                lineToRelative(23.65f, 23.66f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 28.29f, 0.0f)
                lineToRelative(28.69f, -28.7f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 250.18f, 105.17f)
                close()
                moveTo(60.68f, 210.34f)
                lineToRelative(-15.0f, -15.0f)
                lineTo(108.0f, 133.0f)
                lineToRelative(15.0f, 15.0f)
                close()
                moveTo(140.0f, 131.0f)
                lineToRelative(-15.0f, -15.0f)
                lineToRelative(19.51f, -19.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -17.0f)
                lineTo(102.24f, 37.24f)
                arcToRelative(75.94f, 75.94f, 0.0f, false, true, 67.47f, 20.95f)
                lineToRelative(31.44f, 31.67f)
                lineTo(178.0f, 113.0f)
                lineToRelative(-1.51f, -1.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 0.0f)
                close()
                moveTo(207.32f, 142.31f)
                lineTo(195.0f, 130.0f)
                lineToRelative(23.09f, -23.09f)
                lineToRelative(12.3f, 12.39f)
                close()
            }
        }
        .build()
        return _hammer!!
    }

private var _hammer: ImageVector? = null
