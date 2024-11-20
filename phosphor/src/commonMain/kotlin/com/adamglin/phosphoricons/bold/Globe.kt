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

public val BoldGroup.Globe: ImageVector
    get() {
        if (_globe != null) {
            return _globe!!
        }
        _globe = Builder(name = "Globe", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 20.0f)
                arcTo(108.0f, 108.0f, 0.0f, true, false, 236.0f, 128.0f)
                arcTo(108.12f, 108.12f, 0.0f, false, false, 128.0f, 20.0f)
                close()
                moveTo(128.0f, 207.0f)
                arcToRelative(113.4f, 113.4f, 0.0f, false, true, -20.39f, -35.0f)
                horizontalLineToRelative(40.82f)
                arcToRelative(116.94f, 116.94f, 0.0f, false, true, -10.0f, 20.77f)
                arcTo(108.61f, 108.61f, 0.0f, false, true, 128.0f, 207.0f)
                close()
                moveTo(101.51f, 148.0f)
                arcToRelative(135.42f, 135.42f, 0.0f, false, true, 0.0f, -40.0f)
                horizontalLineToRelative(53.0f)
                arcToRelative(135.42f, 135.42f, 0.0f, false, true, 0.0f, 40.0f)
                close()
                moveTo(44.0f, 128.0f)
                arcToRelative(83.49f, 83.49f, 0.0f, false, true, 2.43f, -20.0f)
                lineTo(77.25f, 108.0f)
                arcToRelative(160.63f, 160.63f, 0.0f, false, false, 0.0f, 40.0f)
                lineTo(46.43f, 148.0f)
                arcTo(83.49f, 83.49f, 0.0f, false, true, 44.0f, 128.0f)
                close()
                moveTo(128.0f, 49.0f)
                arcToRelative(113.4f, 113.4f, 0.0f, false, true, 20.39f, 35.0f)
                lineTo(107.59f, 84.0f)
                arcToRelative(116.94f, 116.94f, 0.0f, false, true, 10.0f, -20.77f)
                arcTo(108.61f, 108.61f, 0.0f, false, true, 128.0f, 49.0f)
                close()
                moveTo(178.73f, 108.0f)
                horizontalLineToRelative(30.82f)
                arcToRelative(83.52f, 83.52f, 0.0f, false, true, 0.0f, 40.0f)
                lineTo(178.75f, 148.0f)
                arcToRelative(160.63f, 160.63f, 0.0f, false, false, 0.0f, -40.0f)
                close()
                moveTo(199.5f, 84.0f)
                lineTo(173.71f, 84.0f)
                arcToRelative(140.82f, 140.82f, 0.0f, false, false, -15.5f, -34.36f)
                arcTo(84.51f, 84.51f, 0.0f, false, true, 199.52f, 84.0f)
                close()
                moveTo(97.79f, 49.64f)
                arcTo(140.82f, 140.82f, 0.0f, false, false, 82.29f, 84.0f)
                lineTo(56.48f, 84.0f)
                arcTo(84.51f, 84.51f, 0.0f, false, true, 97.79f, 49.64f)
                close()
                moveTo(56.48f, 172.0f)
                lineTo(82.29f, 172.0f)
                arcToRelative(140.82f, 140.82f, 0.0f, false, false, 15.5f, 34.36f)
                arcTo(84.51f, 84.51f, 0.0f, false, true, 56.48f, 172.0f)
                close()
                moveTo(158.21f, 206.36f)
                arcTo(140.82f, 140.82f, 0.0f, false, false, 173.71f, 172.0f)
                horizontalLineToRelative(25.81f)
                arcTo(84.51f, 84.51f, 0.0f, false, true, 158.21f, 206.36f)
                close()
            }
        }
        .build()
        return _globe!!
    }

private var _globe: ImageVector? = null
