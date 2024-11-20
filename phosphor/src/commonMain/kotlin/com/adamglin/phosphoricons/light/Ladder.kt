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

public val LightGroup.Ladder: ImageVector
    get() {
        if (_ladder != null) {
            return _ladder!!
        }
        _ladder = Builder(name = "Ladder", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(213.64f, 214.0f)
                lineTo(162.38f, 73.0f)
                lineToRelative(9.82f, -27.0f)
                lineTo(184.0f, 46.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                lineTo(88.0f, 34.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(7.43f)
                lineTo(34.36f, 214.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 38.0f, 221.64f)
                arcToRelative(6.15f, 6.15f, 0.0f, false, false, 2.0f, 0.36f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.64f, -3.95f)
                lineTo(55.84f, 190.0f)
                horizontalLineToRelative(51.23f)
                lineTo(98.36f, 214.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 3.59f, 7.69f)
                arcToRelative(6.15f, 6.15f, 0.0f, false, false, 2.0f, 0.36f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.64f, -3.95f)
                lineTo(128.57f, 166.0f)
                horizontalLineToRelative(54.86f)
                lineToRelative(18.93f, 52.05f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 208.0f, 222.0f)
                arcToRelative(6.15f, 6.15f, 0.0f, false, false, 2.05f, -0.36f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 213.64f, 214.0f)
                close()
                moveTo(128.89f, 130.0f)
                lineTo(77.66f, 130.0f)
                lineTo(90.75f, 94.0f)
                lineTo(142.0f, 94.0f)
                close()
                moveTo(159.43f, 46.0f)
                lineTo(146.34f, 82.0f)
                lineTo(95.11f, 82.0f)
                lineTo(108.2f, 46.0f)
                close()
                moveTo(60.2f, 178.0f)
                lineToRelative(13.09f, -36.0f)
                horizontalLineToRelative(51.23f)
                lineToRelative(-13.09f, 36.0f)
                close()
                moveTo(132.93f, 154.0f)
                lineTo(156.0f, 90.56f)
                lineTo(179.07f, 154.0f)
                close()
            }
        }
        .build()
        return _ladder!!
    }

private var _ladder: ImageVector? = null
