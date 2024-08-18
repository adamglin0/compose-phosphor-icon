package com.adamglin.phosphor.phosphoricon.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphor.phosphoricon.FillGroup

public val FillGroup.`Head-circuit-fill`: ImageVector
    get() {
        if (`_head-circuit-fill` != null) {
            return `_head-circuit-fill`!!
        }
        `_head-circuit-fill` = Builder(name = "Head-circuit-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(120.0f, 72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 8.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 120.0f, 72.0f)
                close()
                moveTo(144.0f, 136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 144.0f, 136.0f)
                close()
                moveTo(192.5f, 171.47f)
                arcTo(88.32f, 88.32f, 0.0f, false, false, 224.0f, 101.89f)
                quadToRelative(0.0f, -1.1f, -0.09f, -2.19f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -3.75f)
                lineTo(195.75f, 95.95f)
                lineTo(172.62f, 123.7f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, -12.28f, -10.25f)
                lineToRelative(25.51f, -30.62f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 192.0f, 80.0f)
                horizontalLineToRelative(23.14f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.77f, -5.35f)
                curveTo(207.27f, 42.0f, 176.86f, 18.0f, 140.74f, 16.08f)
                lineToRelative(-0.59f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.15f, 4.0f)
                lineTo(136.0f, 49.33f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, -16.0f, 0.0f)
                verticalLineToRelative(-27.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.89f, -3.91f)
                arcTo(88.16f, 88.16f, 0.0f, false, false, 48.0f, 102.0f)
                lineTo(25.55f, 145.14f)
                lineToRelative(-0.22f, 0.45f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 7.51f, 20.7f)
                lineToRelative(0.25f, 0.12f)
                lineTo(56.0f, 176.9f)
                verticalLineToRelative(31.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(40.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                horizontalLineToRelative(71.77f)
                arcToRelative(8.42f, 8.42f, 0.0f, false, false, 4.06f, -1.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.11f, -8.0f)
                close()
            }
        }
        .build()
        return `_head-circuit-fill`!!
    }

private var `_head-circuit-fill`: ImageVector? = null
