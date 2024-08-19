package com.adamglin.phosphoricon.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.FillGroup

public val FillGroup.`Beer-stein-fill`: ImageVector
    get() {
        if (`_beer-stein-fill` != null) {
            return `_beer-stein-fill`!!
        }
        `_beer-stein-fill` = Builder(name = "Beer-stein-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 88.0f)
                lineTo(200.0f, 88.0f)
                lineTo(200.0f, 72.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, -40.0f, -40.0f)
                lineTo(148.82f, 32.0f)
                curveToRelative(-11.91f, -10.2f, -28.0f, -16.0f, -44.82f, -16.0f)
                curveTo(68.71f, 16.0f, 40.0f, 41.12f, 40.0f, 72.0f)
                lineTo(40.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(184.0f, 224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 24.0f, -24.0f)
                lineTo(240.0f, 112.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 216.0f, 88.0f)
                close()
                moveTo(104.0f, 184.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(88.0f, 104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                close()
                moveTo(152.0f, 184.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(136.0f, 104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                close()
                moveTo(57.0f, 64.0f)
                curveToRelative(4.46f, -18.24f, 23.85f, -32.0f, 47.0f, -32.0f)
                curveToRelative(13.87f, 0.0f, 27.06f, 5.0f, 36.21f, 13.78f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 145.74f, 48.0f)
                lineTo(160.0f, 48.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 22.62f, 16.0f)
                close()
                moveTo(224.0f, 176.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(200.0f, 184.0f)
                lineTo(200.0f, 104.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, 8.0f)
                close()
            }
        }
        .build()
        return `_beer-stein-fill`!!
    }

private var `_beer-stein-fill`: ImageVector? = null
