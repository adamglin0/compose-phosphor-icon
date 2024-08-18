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

public val RegularGroup.`Crown-cross`: ImageVector
    get() {
        if (`_crown-cross` != null) {
            return `_crown-cross`!!
        }
        `_crown-cross` = Builder(name = "Crown-cross", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(180.0f, 56.0f)
                curveToRelative(-17.74f, 0.0f, -33.21f, 6.48f, -44.0f, 17.16f)
                lineTo(136.0f, 40.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                lineTo(136.0f, 24.0f)
                lineTo(136.0f, 8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                lineTo(120.0f, 24.0f)
                lineTo(104.0f, 24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(16.0f)
                lineTo(120.0f, 73.16f)
                curveTo(109.21f, 62.48f, 93.74f, 56.0f, 76.0f, 56.0f)
                arcToRelative(60.07f, 60.07f, 0.0f, false, false, -60.0f, 60.0f)
                curveToRelative(0.0f, 29.86f, 14.54f, 48.85f, 26.73f, 59.52f)
                arcTo(90.48f, 90.48f, 0.0f, false, false, 64.0f, 189.34f)
                lineTo(64.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(192.0f, 189.34f)
                arcToRelative(90.48f, 90.48f, 0.0f, false, false, 21.27f, -13.82f)
                curveTo(225.46f, 164.85f, 240.0f, 145.86f, 240.0f, 116.0f)
                arcTo(60.07f, 60.07f, 0.0f, false, false, 180.0f, 56.0f)
                close()
                moveTo(181.47f, 176.41f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 176.0f, 184.0f)
                verticalLineToRelative(24.0f)
                lineTo(80.0f, 208.0f)
                lineTo(80.0f, 184.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.47f, -7.59f)
                curveTo(74.1f, 176.27f, 32.0f, 161.7f, 32.0f, 116.0f)
                arcTo(44.05f, 44.05f, 0.0f, false, true, 76.0f, 72.0f)
                curveToRelative(25.5f, 0.0f, 44.0f, 16.82f, 44.0f, 40.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(136.0f, 112.0f)
                curveToRelative(0.0f, -23.18f, 18.5f, -40.0f, 44.0f, -40.0f)
                arcToRelative(44.05f, 44.05f, 0.0f, false, true, 44.0f, 44.0f)
                curveTo(224.0f, 161.4f, 183.18f, 175.83f, 181.47f, 176.41f)
                close()
            }
        }
        .build()
        return `_crown-cross`!!
    }

private var `_crown-cross`: ImageVector? = null
