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

public val DuotoneGroup.`Beach-ball-duotone`: ImageVector
    get() {
        if (`_beach-ball-duotone` != null) {
            return `_beach-ball-duotone`!!
        }
        `_beach-ball-duotone` = Builder(name = "Beach-ball-duotone", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(161.23f, 93.36f)
                arcToRelative(191.07f, 191.07f, 0.0f, false, false, -82.0f, -48.09f)
                arcToRelative(96.4f, 96.4f, 0.0f, false, true, 68.68f, -11.2f)
                arcTo(191.91f, 191.91f, 0.0f, false, true, 161.23f, 93.36f)
                close()
                moveTo(221.93f, 108.06f)
                arcToRelative(192.2f, 192.2f, 0.0f, false, false, -59.29f, -13.29f)
                arcToRelative(191.0f, 191.0f, 0.0f, false, true, 48.09f, 82.0f)
                arcToRelative(96.37f, 96.37f, 0.0f, false, false, 11.2f, -68.67f)
                close()
                moveTo(32.27f, 135.19f)
                arcToRelative(96.0f, 96.0f, 0.0f, false, false, 88.54f, 88.54f)
                arcToRelative(191.56f, 191.56f, 0.0f, false, false, 40.5f, -129.0f)
                arcTo(191.61f, 191.61f, 0.0f, false, false, 32.27f, 135.19f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 24.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f)
                arcTo(104.11f, 104.11f, 0.0f, false, false, 128.0f, 24.0f)
                close()
                moveTo(209.7f, 95.3f)
                arcToRelative(199.77f, 199.77f, 0.0f, false, false, -40.94f, -8.06f)
                arcTo(199.77f, 199.77f, 0.0f, false, false, 160.7f, 46.3f)
                arcTo(88.57f, 88.57f, 0.0f, false, true, 209.7f, 95.3f)
                close()
                moveTo(216.0f, 128.0f)
                arcToRelative(87.83f, 87.83f, 0.0f, false, true, -4.28f, 27.12f)
                arcToRelative(200.28f, 200.28f, 0.0f, false, false, -29.16f, -49.93f)
                arcToRelative(183.12f, 183.12f, 0.0f, false, true, 32.31f, 8.75f)
                arcTo(88.14f, 88.14f, 0.0f, false, true, 216.0f, 128.0f)
                close()
                moveTo(142.06f, 41.13f)
                arcToRelative(183.12f, 183.12f, 0.0f, false, true, 8.75f, 32.31f)
                arcToRelative(200.28f, 200.28f, 0.0f, false, false, -49.93f, -29.16f)
                arcToRelative(88.05f, 88.05f, 0.0f, false, true, 41.18f, -3.15f)
                close()
                moveTo(80.44f, 54.0f)
                arcToRelative(183.88f, 183.88f, 0.0f, false, true, 61.25f, 32.64f)
                arcTo(200.21f, 200.21f, 0.0f, false, false, 40.41f, 119.5f)
                arcTo(88.11f, 88.11f, 0.0f, false, true, 80.44f, 54.0f)
                close()
                moveTo(40.67f, 138.86f)
                arcToRelative(184.08f, 184.08f, 0.0f, false, true, 112.88f, -36.41f)
                arcToRelative(184.08f, 184.08f, 0.0f, false, true, -36.41f, 112.88f)
                arcTo(88.18f, 88.18f, 0.0f, false, true, 40.67f, 138.86f)
                close()
                moveTo(136.5f, 215.59f)
                arcToRelative(200.21f, 200.21f, 0.0f, false, false, 32.87f, -101.28f)
                arcTo(183.88f, 183.88f, 0.0f, false, true, 202.0f, 175.56f)
                arcTo(88.11f, 88.11f, 0.0f, false, true, 136.5f, 215.59f)
                close()
            }
        }
        .build()
        return `_beach-ball-duotone`!!
    }

private var `_beach-ball-duotone`: ImageVector? = null
