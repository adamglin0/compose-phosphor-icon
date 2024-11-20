package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.CubeTransparent: ImageVector
    get() {
        if (_cubeTransparent != null) {
            return _cubeTransparent!!
        }
        _cubeTransparent = Builder(name = "CubeTransparent", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(104.0f, 152.0f)
                lineTo(104.0f, 104.0f)
                horizontalLineToRelative(48.0f)
                verticalLineToRelative(48.0f)
                close()
                moveTo(32.0f, 53.0f)
                verticalLineToRelative(95.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                lineTo(88.0f, 152.0f)
                lineTo(88.0f, 99.31f)
                lineTo(38.83f, 50.14f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 32.0f, 53.0f)
                close()
                moveTo(220.0f, 104.0f)
                lineTo(168.0f, 104.0f)
                verticalLineToRelative(52.69f)
                lineToRelative(49.17f, 49.17f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 224.0f, 203.0f)
                lineTo(224.0f, 108.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 220.0f, 104.0f)
                close()
                moveTo(152.0f, 36.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                lineTo(53.0f, 32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.83f, 6.83f)
                lineTo(99.31f, 88.0f)
                lineTo(152.0f, 88.0f)
                close()
                moveTo(212.49f, 81.17f)
                lineTo(174.83f, 43.51f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 168.0f, 46.34f)
                lineTo(168.0f, 88.0f)
                horizontalLineToRelative(41.66f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 212.49f, 81.17f)
                close()
                moveTo(156.69f, 168.0f)
                lineTo(104.0f, 168.0f)
                verticalLineToRelative(52.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineToRelative(95.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.83f, -6.83f)
                close()
                moveTo(43.51f, 174.83f)
                lineToRelative(37.66f, 37.66f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 88.0f, 209.66f)
                lineTo(88.0f, 168.0f)
                lineTo(46.34f, 168.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 43.51f, 174.83f)
                close()
            }
        }
        .build()
        return _cubeTransparent!!
    }

private var _cubeTransparent: ImageVector? = null
