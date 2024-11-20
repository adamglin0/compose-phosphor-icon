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

public val BoldGroup.Pepper: ImageVector
    get() {
        if (_pepper != null) {
            return _pepper!!
        }
        _pepper = Builder(name = "Pepper", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(170.56f, 36.82f)
                arcTo(44.08f, 44.08f, 0.0f, false, false, 128.0f, 4.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 17.09f, 9.66f)
                arcTo(68.11f, 68.11f, 0.0f, false, false, 92.0f, 104.0f)
                curveToRelative(0.0f, 21.74f, -5.83f, 40.14f, -17.32f, 54.69f)
                curveToRelative(-12.22f, 15.47f, -31.18f, 27.08f, -56.34f, 34.49f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 2.2f, 38.91f)
                arcTo(268.22f, 268.22f, 0.0f, false, false, 66.64f, 236.0f)
                curveToRelative(41.61f, 0.0f, 88.0f, -9.38f, 120.21f, -36.38f)
                curveTo(214.16f, 176.72f, 228.0f, 144.55f, 228.0f, 104.0f)
                horizontalLineToRelative(0.0f)
                arcTo(68.11f, 68.11f, 0.0f, false, false, 170.56f, 36.82f)
                close()
                moveTo(160.0f, 60.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, true, 40.32f, 26.41f)
                lineTo(192.0f, 90.58f)
                lineTo(165.37f, 77.26f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -10.74f, 0.0f)
                lineTo(128.0f, 90.58f)
                lineToRelative(-8.32f, -4.17f)
                arcTo(44.0f, 44.0f, 0.0f, false, true, 160.0f, 60.0f)
                close()
                moveTo(171.43f, 181.23f)
                curveToRelative(-17.4f, 14.59f, -42.33f, 24.47f, -72.1f, 28.58f)
                arcToRelative(251.28f, 251.28f, 0.0f, false, true, -58.21f, 0.89f)
                curveToRelative(46.68f, -18.51f, 72.28f, -52.54f, 74.68f, -99.39f)
                lineToRelative(6.83f, 3.42f)
                arcToRelative(12.07f, 12.07f, 0.0f, false, false, 10.74f, 0.0f)
                lineTo(160.0f, 101.41f)
                lineToRelative(26.63f, 13.32f)
                arcToRelative(12.07f, 12.07f, 0.0f, false, false, 10.74f, 0.0f)
                lineToRelative(6.43f, -3.22f)
                curveTo(202.24f, 141.07f, 191.38f, 164.5f, 171.43f, 181.23f)
                close()
            }
        }
        .build()
        return _pepper!!
    }

private var _pepper: ImageVector? = null
