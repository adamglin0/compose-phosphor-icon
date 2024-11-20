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

public val BoldGroup.DribbbleLogo: ImageVector
    get() {
        if (_dribbbleLogo != null) {
            return _dribbbleLogo!!
        }
        _dribbbleLogo = Builder(name = "DribbbleLogo", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 20.0f)
                arcTo(108.0f, 108.0f, 0.0f, true, false, 236.0f, 128.0f)
                arcTo(108.12f, 108.12f, 0.0f, false, false, 128.0f, 20.0f)
                close()
                moveTo(211.13f, 116.0f)
                curveToRelative(-1.0f, 0.0f, -2.08f, 0.0f, -3.12f, 0.0f)
                arcToRelative(172.63f, 172.63f, 0.0f, false, false, -41.39f, 5.06f)
                arcTo(171.26f, 171.26f, 0.0f, false, false, 156.0f, 97.39f)
                arcTo(172.34f, 172.34f, 0.0f, false, false, 188.9f, 70.24f)
                arcTo(83.72f, 83.72f, 0.0f, false, true, 211.13f, 116.0f)
                close()
                moveTo(170.0f, 55.3f)
                arcToRelative(148.53f, 148.53f, 0.0f, false, true, -27.0f, 21.88f)
                arcToRelative(173.29f, 173.29f, 0.0f, false, false, -30.58f, -31.71f)
                arcTo(83.52f, 83.52f, 0.0f, false, true, 170.0f, 55.3f)
                close()
                moveTo(85.54f, 55.57f)
                arcToRelative(149.23f, 149.23f, 0.0f, false, true, 35.9f, 32.87f)
                arcTo(147.73f, 147.73f, 0.0f, false, true, 64.0f, 100.0f)
                curveToRelative(-5.0f, 0.0f, -10.0f, -0.26f, -14.94f, -0.75f)
                arcTo(84.49f, 84.49f, 0.0f, false, true, 85.53f, 55.57f)
                close()
                moveTo(44.0f, 128.0f)
                curveToRelative(0.0f, -1.73f, 0.07f, -3.44f, 0.17f, -5.14f)
                arcTo(175.15f, 175.15f, 0.0f, false, false, 64.0f, 124.0f)
                arcToRelative(171.8f, 171.8f, 0.0f, false, false, 70.84f, -15.22f)
                arcToRelative(145.82f, 145.82f, 0.0f, false, true, 8.92f, 19.65f)
                arcToRelative(170.71f, 170.71f, 0.0f, false, false, -21.52f, 10.44f)
                arcToRelative(173.0f, 173.0f, 0.0f, false, false, -53.68f, 48.44f)
                arcTo(83.77f, 83.77f, 0.0f, false, true, 44.0f, 128.0f)
                close()
                moveTo(87.77f, 201.72f)
                arcToRelative(149.0f, 149.0f, 0.0f, false, true, 46.46f, -42.06f)
                arcToRelative(147.2f, 147.2f, 0.0f, false, true, 16.0f, -7.94f)
                arcToRelative(148.52f, 148.52f, 0.0f, false, true, 2.67f, 28.0f)
                arcTo(148.66f, 148.66f, 0.0f, false, true, 150.0f, 209.06f)
                arcToRelative(83.81f, 83.81f, 0.0f, false, true, -62.22f, -7.34f)
                close()
                moveTo(176.06f, 196.83f)
                curveToRelative(0.56f, -5.68f, 0.86f, -11.4f, 0.86f, -17.14f)
                arcToRelative(172.57f, 172.57f, 0.0f, false, false, -3.72f, -35.54f)
                arcTo(148.85f, 148.85f, 0.0f, false, true, 208.0f, 140.0f)
                curveToRelative(1.0f, 0.0f, 2.07f, 0.0f, 3.11f, 0.0f)
                arcTo(84.07f, 84.07f, 0.0f, false, true, 176.06f, 196.83f)
                close()
            }
        }
        .build()
        return _dribbbleLogo!!
    }

private var _dribbbleLogo: ImageVector? = null
