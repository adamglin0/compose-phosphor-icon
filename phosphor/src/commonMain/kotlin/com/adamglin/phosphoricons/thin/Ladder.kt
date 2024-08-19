package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.Ladder: ImageVector
    get() {
        if (_ladder != null) {
            return _ladder!!
        }
        _ladder = Builder(name = "Ladder", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(211.76f, 214.63f)
                lineTo(160.26f, 73.0f)
                lineTo(170.8f, 44.0f)
                lineTo(184.0f, 44.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                lineTo(88.0f, 36.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                lineTo(98.29f, 44.0f)
                lineToRelative(-62.0f, 170.63f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.39f, 5.13f)
                arcTo(4.16f, 4.16f, 0.0f, false, false, 40.0f, 220.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.76f, -2.63f)
                lineTo(54.44f, 188.0f)
                horizontalLineToRelative(55.49f)
                lineToRelative(-9.69f, 26.63f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.39f, 5.13f)
                arcTo(4.12f, 4.12f, 0.0f, false, false, 104.0f, 220.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.76f, -2.63f)
                lineTo(127.17f, 164.0f)
                horizontalLineToRelative(57.66f)
                lineToRelative(19.41f, 53.37f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 208.0f, 220.0f)
                arcToRelative(4.16f, 4.16f, 0.0f, false, false, 1.37f, -0.24f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 211.76f, 214.63f)
                close()
                moveTo(130.29f, 132.0f)
                lineTo(74.8f, 132.0f)
                lineTo(89.35f, 92.0f)
                horizontalLineToRelative(55.48f)
                close()
                moveTo(162.29f, 44.0f)
                lineTo(147.74f, 84.0f)
                lineTo(92.26f, 84.0f)
                lineTo(106.8f, 44.0f)
                close()
                moveTo(57.35f, 180.0f)
                lineToRelative(14.54f, -40.0f)
                horizontalLineToRelative(55.49f)
                lineToRelative(-14.55f, 40.0f)
                close()
                moveTo(130.07f, 156.0f)
                lineTo(156.0f, 84.7f)
                lineTo(181.92f, 156.0f)
                close()
            }
        }
        .build()
        return _ladder!!
    }

private var _ladder: ImageVector? = null
