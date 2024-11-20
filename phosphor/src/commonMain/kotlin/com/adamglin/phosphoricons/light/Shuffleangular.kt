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

public val LightGroup.ShuffleAngular: ImageVector
    get() {
        if (_shuffleAngular != null) {
            return _shuffleAngular!!
        }
        _shuffleAngular = Builder(name = "ShuffleAngular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.24f, 179.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 8.48f)
                lineToRelative(-24.0f, 24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.48f, -8.48f)
                lineTo(217.52f, 190.0f)
                lineTo(168.0f, 190.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -4.88f, -2.51f)
                lineTo(84.91f, 78.0f)
                lineTo(32.0f, 78.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                lineTo(88.0f, 66.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 4.88f, 2.51f)
                lineTo(171.09f, 178.0f)
                horizontalLineToRelative(46.43f)
                lineToRelative(-13.76f, -13.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.48f, -8.48f)
                close()
                moveTo(144.17f, 105.36f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.37f, -1.4f)
                lineToRelative(18.55f, -26.0f)
                horizontalLineToRelative(46.43f)
                lineTo(203.76f, 91.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 8.48f, 8.48f)
                lineToRelative(24.0f, -24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -8.48f)
                lineToRelative(-24.0f, -24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.48f, 8.48f)
                lineTo(217.52f, 66.0f)
                lineTo(168.0f, 66.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -4.88f, 2.51f)
                lineTo(142.78f, 97.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 144.17f, 105.36f)
                close()
                moveTo(111.83f, 150.64f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.37f, 1.4f)
                lineTo(84.91f, 178.0f)
                lineTo(32.0f, 178.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                lineTo(88.0f, 190.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.88f, -2.51f)
                lineTo(113.22f, 159.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 111.83f, 150.64f)
                close()
            }
        }
        .build()
        return _shuffleAngular!!
    }

private var _shuffleAngular: ImageVector? = null
