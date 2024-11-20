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

public val LightGroup.CellTower: ImageVector
    get() {
        if (_cellTower != null) {
            return _cellTower!!
        }
        _cellTower = Builder(name = "CellTower", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(133.37f, 85.32f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -10.74f, 0.0f)
                lineToRelative(-72.0f, 144.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 10.74f, 5.37f)
                lineTo(75.71f, 206.0f)
                lineTo(180.29f, 206.0f)
                lineToRelative(14.34f, 28.68f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 200.0f, 238.0f)
                arcToRelative(5.87f, 5.87f, 0.0f, false, false, 2.68f, -0.64f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 2.69f, -8.05f)
                close()
                moveTo(128.0f, 101.42f)
                lineTo(158.29f, 162.0f)
                lineTo(97.71f, 162.0f)
                close()
                moveTo(81.71f, 194.0f)
                lineToRelative(10.0f, -20.0f)
                horizontalLineToRelative(72.58f)
                lineToRelative(10.0f, 20.0f)
                close()
                moveTo(161.45f, 94.1f)
                arcTo(33.59f, 33.59f, 0.0f, false, false, 162.0f, 88.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, false, false, -68.0f, 0.0f)
                arcToRelative(33.59f, 33.59f, 0.0f, false, false, 0.55f, 6.1f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -11.81f, 2.13f)
                arcToRelative(46.0f, 46.0f, 0.0f, true, true, 90.52f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.89f, 4.94f)
                arcToRelative(5.64f, 5.64f, 0.0f, false, true, -1.08f, -0.1f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 161.45f, 94.1f)
                close()
                moveTo(65.75f, 135.0f)
                arcTo(78.0f, 78.0f, 0.0f, true, true, 206.0f, 88.0f)
                arcToRelative(77.33f, 77.33f, 0.0f, false, true, -15.75f, 47.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -9.57f, -7.24f)
                arcTo(65.42f, 65.42f, 0.0f, false, false, 194.0f, 88.0f)
                arcTo(66.0f, 66.0f, 0.0f, false, false, 62.0f, 88.0f)
                arcToRelative(65.42f, 65.42f, 0.0f, false, false, 13.32f, 39.76f)
                arcTo(6.0f, 6.0f, 0.0f, true, true, 65.75f, 135.0f)
                close()
            }
        }
        .build()
        return _cellTower!!
    }

private var _cellTower: ImageVector? = null
