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

public val BoldGroup.CellTower: ImageVector
    get() {
        if (_cellTower != null) {
            return _cellTower!!
        }
        _cellTower = Builder(name = "CellTower", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(138.67f, 86.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -21.34f, 0.0f)
                lineToRelative(-72.0f, 140.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 21.34f, 11.0f)
                lineToRelative(11.0f, -21.49f)
                lineTo(178.28f, 216.02f)
                lineToRelative(11.05f, 21.49f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 21.34f, -11.0f)
                close()
                moveTo(128.0f, 118.24f)
                lineTo(145.36f, 152.0f)
                lineTo(110.64f, 152.0f)
                close()
                moveTo(90.07f, 192.0f)
                lineToRelative(8.22f, -16.0f)
                horizontalLineToRelative(59.42f)
                lineToRelative(8.22f, 16.0f)
                close()
                moveTo(174.51f, 68.73f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -21.45f, 10.75f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -50.37f, 0.52f)
                arcTo(12.0f, 12.0f, 0.0f, true, true, 81.0f, 69.7f)
                arcTo(52.28f, 52.28f, 0.0f, false, true, 128.0f, 40.0f)
                arcTo(51.74f, 51.74f, 0.0f, false, true, 174.51f, 68.73f)
                close()
                moveTo(49.93f, 144.73f)
                arcToRelative(92.0f, 92.0f, 0.0f, true, true, 156.14f, 0.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 185.71f, 132.0f)
                arcToRelative(68.0f, 68.0f, 0.0f, true, false, -115.42f, 0.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 49.93f, 144.7f)
                close()
            }
        }
        .build()
        return _cellTower!!
    }

private var _cellTower: ImageVector? = null
