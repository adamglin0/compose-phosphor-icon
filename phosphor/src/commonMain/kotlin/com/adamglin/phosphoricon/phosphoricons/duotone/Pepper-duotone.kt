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

public val DuotoneGroup.`Pepper-duotone`: ImageVector
    get() {
        if (`_pepper-duotone` != null) {
            return `_pepper-duotone`!!
        }
        `_pepper-duotone` = Builder(name = "Pepper-duotone", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(214.83f, 92.58f)
                lineTo(192.0f, 104.0f)
                lineTo(160.0f, 88.0f)
                lineToRelative(-32.0f, 16.0f)
                lineTo(105.17f, 92.58f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, true, 109.66f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(167.27f, 40.42f)
                arcTo(40.06f, 40.06f, 0.0f, false, false, 128.0f, 8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 22.85f, 16.66f)
                arcTo(64.08f, 64.08f, 0.0f, false, false, 96.0f, 104.0f)
                curveToRelative(0.0f, 46.75f, -25.75f, 78.0f, -76.53f, 93.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 1.77f, 31.13f)
                arcTo(264.8f, 264.8f, 0.0f, false, false, 66.75f, 232.0f)
                curveToRelative(40.78f, 0.0f, 86.16f, -9.15f, 117.53f, -35.46f)
                curveTo(210.64f, 174.44f, 224.0f, 143.3f, 224.0f, 104.0f)
                horizontalLineToRelative(0.0f)
                arcTo(64.07f, 64.07f, 0.0f, false, false, 167.27f, 40.42f)
                close()
                moveTo(160.0f, 56.0f)
                arcToRelative(48.07f, 48.07f, 0.0f, false, true, 45.37f, 32.37f)
                lineTo(192.0f, 95.0f)
                lineTo(163.58f, 80.83f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.16f, 0.0f)
                lineTo(128.0f, 95.0f)
                lineToRelative(-13.37f, -6.68f)
                arcTo(48.08f, 48.08f, 0.0f, false, true, 160.0f, 56.0f)
                close()
                moveTo(174.0f, 184.3f)
                curveToRelative(-18.0f, 15.07f, -43.6f, 25.26f, -74.12f, 29.47f)
                arcTo(254.41f, 254.41f, 0.0f, false, true, 24.0f, 212.37f)
                horizontalLineToRelative(0.0f)
                verticalLineToRelative(0.0f)
                curveToRelative(57.23f, -16.87f, 87.63f, -54.0f, 88.0f, -107.42f)
                lineToRelative(12.44f, 6.22f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.16f, 0.0f)
                lineTo(160.0f, 96.93f)
                lineToRelative(28.42f, 14.21f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.16f, 0.0f)
                lineToRelative(12.41f, -6.2f)
                curveTo(207.78f, 138.84f, 196.35f, 165.54f, 174.0f, 184.29f)
                close()
            }
        }
        .build()
        return `_pepper-duotone`!!
    }

private var `_pepper-duotone`: ImageVector? = null
