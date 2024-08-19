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

public val ThinGroup.Heart: ImageVector
    get() {
        if (_heart != null) {
            return _heart!!
        }
        _heart = Builder(name = "Heart", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(178.0f, 44.0f)
                curveToRelative(-21.44f, 0.0f, -39.92f, 10.19f, -50.0f, 27.07f)
                curveTo(117.92f, 54.19f, 99.44f, 44.0f, 78.0f, 44.0f)
                arcToRelative(58.07f, 58.07f, 0.0f, false, false, -58.0f, 58.0f)
                curveToRelative(0.0f, 28.59f, 18.0f, 58.47f, 53.4f, 88.79f)
                arcToRelative(333.81f, 333.81f, 0.0f, false, false, 52.7f, 36.73f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.8f, 0.0f)
                arcToRelative(333.81f, 333.81f, 0.0f, false, false, 52.7f, -36.73f)
                curveTo(218.0f, 160.47f, 236.0f, 130.59f, 236.0f, 102.0f)
                arcTo(58.07f, 58.07f, 0.0f, false, false, 178.0f, 44.0f)
                close()
                moveTo(128.0f, 219.42f)
                curveToRelative(-14.0f, -8.0f, -100.0f, -59.35f, -100.0f, -117.42f)
                arcTo(50.06f, 50.06f, 0.0f, false, true, 78.0f, 52.0f)
                curveToRelative(21.11f, 0.0f, 38.85f, 11.31f, 46.3f, 29.51f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 7.4f, 0.0f)
                curveTo(139.15f, 63.31f, 156.89f, 52.0f, 178.0f, 52.0f)
                arcToRelative(50.06f, 50.06f, 0.0f, false, true, 50.0f, 50.0f)
                curveTo(228.0f, 160.0f, 142.0f, 211.46f, 128.0f, 219.42f)
                close()
            }
        }
        .build()
        return _heart!!
    }

private var _heart: ImageVector? = null
