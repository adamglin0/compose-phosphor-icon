package com.adamglin.phosphoricon.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.DuotoneGroup

public val DuotoneGroup.`Dribbble-logo-duotone`: ImageVector
    get() {
        if (`_dribbble-logo-duotone` != null) {
            return `_dribbble-logo-duotone`!!
        }
        `_dribbble-logo-duotone` = Builder(name = "Dribbble-logo-duotone", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(224.0f, 128.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, true, true, -96.0f, -96.0f)
                arcTo(96.0f, 96.0f, 0.0f, false, true, 224.0f, 128.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 24.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f)
                arcTo(104.11f, 104.11f, 0.0f, false, false, 128.0f, 24.0f)
                close()
                moveTo(215.65f, 120.18f)
                quadTo(211.83f, 120.0f, 208.0f, 120.0f)
                arcToRelative(168.58f, 168.58f, 0.0f, false, false, -43.94f, 5.84f)
                arcTo(166.52f, 166.52f, 0.0f, false, false, 150.61f, 96.0f)
                arcToRelative(168.32f, 168.32f, 0.0f, false, false, 38.2f, -31.55f)
                arcTo(87.78f, 87.78f, 0.0f, false, true, 215.65f, 120.18f)
                close()
                moveTo(176.28f, 54.46f)
                arcTo(151.75f, 151.75f, 0.0f, false, true, 142.0f, 82.52f)
                arcToRelative(169.22f, 169.22f, 0.0f, false, false, -38.63f, -39.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, false, true, 73.0f, 10.94f)
                close()
                moveTo(85.65f, 50.88f)
                arcToRelative(153.13f, 153.13f, 0.0f, false, true, 42.0f, 39.18f)
                arcTo(151.82f, 151.82f, 0.0f, false, true, 64.0f, 104.0f)
                arcToRelative(154.19f, 154.19f, 0.0f, false, true, -20.28f, -1.35f)
                arcTo(88.39f, 88.39f, 0.0f, false, true, 85.65f, 50.88f)
                close()
                moveTo(40.0f, 128.0f)
                arcToRelative(87.73f, 87.73f, 0.0f, false, true, 0.53f, -9.64f)
                arcTo(168.85f, 168.85f, 0.0f, false, false, 64.0f, 120.0f)
                arcToRelative(167.84f, 167.84f, 0.0f, false, false, 72.52f, -16.4f)
                arcToRelative(150.82f, 150.82f, 0.0f, false, true, 12.31f, 27.13f)
                arcToRelative(167.11f, 167.11f, 0.0f, false, false, -24.59f, 11.6f)
                arcToRelative(169.22f, 169.22f, 0.0f, false, false, -55.07f, 51.06f)
                arcTo(87.8f, 87.8f, 0.0f, false, true, 40.0f, 128.0f)
                close()
                moveTo(82.0f, 203.0f)
                arcToRelative(152.91f, 152.91f, 0.0f, false, true, 50.24f, -46.79f)
                arcToRelative(148.81f, 148.81f, 0.0f, false, true, 20.95f, -10.0f)
                arcToRelative(152.48f, 152.48f, 0.0f, false, true, 3.73f, 33.47f)
                arcToRelative(152.93f, 152.93f, 0.0f, false, true, -3.49f, 32.56f)
                arcTo(87.92f, 87.92f, 0.0f, false, true, 82.0f, 203.0f)
                close()
                moveTo(171.06f, 204.73f)
                arcToRelative(170.0f, 170.0f, 0.0f, false, false, 1.86f, -25.0f)
                arcToRelative(168.69f, 168.69f, 0.0f, false, false, -4.45f, -38.47f)
                arcTo(152.31f, 152.31f, 0.0f, false, true, 208.0f, 136.0f)
                quadToRelative(3.8f, 0.0f, 7.61f, 0.19f)
                arcTo(88.13f, 88.13f, 0.0f, false, true, 171.06f, 204.72f)
                close()
            }
        }
        .build()
        return `_dribbble-logo-duotone`!!
    }

private var `_dribbble-logo-duotone`: ImageVector? = null
