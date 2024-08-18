package com.adamglin.phosphor.phosphoricon.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphor.phosphoricon.RegularGroup

public val RegularGroup.`Face-mask`: ImageVector
    get() {
        if (`_face-mask` != null) {
            return `_face-mask`!!
        }
        `_face-mask` = Builder(name = "Face-mask", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(176.0f, 104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(88.0f, 112.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(80.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 176.0f, 104.0f)
                close()
                moveTo(168.0f, 128.0f)
                lineTo(88.0f, 128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(256.0f, 104.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, -32.0f, 32.0f)
                horizontalLineToRelative(-5.19f)
                curveToRelative(-7.19f, 15.8f, -21.79f, 29.43f, -43.23f, 40.16f)
                arcToRelative(191.16f, 191.16f, 0.0f, false, true, -46.15f, 15.71f)
                arcToRelative(7.93f, 7.93f, 0.0f, false, true, -2.86f, 0.0f)
                arcToRelative(191.16f, 191.16f, 0.0f, false, true, -46.15f, -15.71f)
                curveTo(59.0f, 189.43f, 44.38f, 175.8f, 37.19f, 160.0f)
                lineTo(32.0f, 160.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 0.0f, 128.0f)
                lineTo(0.0f, 104.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 32.0f, 72.0f)
                horizontalLineToRelative(0.85f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 9.68f, -10.0f)
                lineToRelative(80.0f, -29.09f)
                arcToRelative(16.06f, 16.06f, 0.0f, false, true, 10.94f, 0.0f)
                lineToRelative(80.0f, 29.09f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 9.68f, 10.0f)
                lineTo(224.0f, 72.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 256.0f, 104.0f)
                close()
                moveTo(32.55f, 144.0f)
                arcToRelative(58.74f, 58.74f, 0.0f, false, true, -0.55f, -8.0f)
                lineTo(32.0f, 88.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                close()
                moveTo(208.0f, 136.0f)
                lineTo(208.0f, 77.09f)
                lineTo(128.0f, 48.0f)
                lineTo(48.0f, 77.09f)
                lineTo(48.0f, 136.0f)
                curveToRelative(0.0f, 45.0f, 69.09f, 61.52f, 80.0f, 63.84f)
                curveTo(138.89f, 197.52f, 208.0f, 181.0f, 208.0f, 136.0f)
                close()
                moveTo(240.0f, 104.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(58.74f, 58.74f, 0.0f, false, true, -0.55f, 8.0f)
                lineTo(224.0f, 144.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                close()
            }
        }
        .build()
        return `_face-mask`!!
    }

private var `_face-mask`: ImageVector? = null
