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

public val FillGroup.`Strategy-fill`: ImageVector
    get() {
        if (`_strategy-fill` != null) {
            return `_strategy-fill`!!
        }
        `_strategy-fill` = Builder(name = "Strategy-fill", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(108.0f, 188.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, -32.0f, -32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 108.0f, 188.0f)
                close()
                moveTo(53.66f, 117.66f)
                lineTo(68.0f, 103.31f)
                lineToRelative(14.34f, 14.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, -11.32f)
                lineTo(79.31f, 92.0f)
                lineTo(93.66f, 77.66f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 82.34f, 66.34f)
                lineTo(68.0f, 80.69f)
                lineTo(53.66f, 66.34f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 42.34f, 77.66f)
                lineTo(56.69f, 92.0f)
                lineTo(42.34f, 106.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, 11.32f)
                close()
                moveTo(215.31f, 188.0f)
                lineToRelative(14.35f, -14.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, -11.32f)
                lineTo(204.0f, 176.69f)
                lineToRelative(-14.34f, -14.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, 11.32f)
                lineTo(192.69f, 188.0f)
                lineToRelative(-14.35f, 14.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, 11.32f)
                lineTo(204.0f, 199.31f)
                lineToRelative(14.34f, 14.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, -11.32f)
                close()
                moveTo(165.66f, 50.34f)
                lineTo(163.31f, 48.0f)
                horizontalLineTo(184.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                horizontalLineTo(144.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineTo(80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                verticalLineTo(59.31f)
                lineToRelative(2.34f, 2.35f)
                curveToRelative(17.93f, 17.93f, 17.9f, 35.4f, 14.71f, 46.9f)
                curveToRelative(-4.64f, 16.77f, -19.36f, 31.77f, -35.0f, 35.68f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 136.0f, 160.0f)
                arcToRelative(8.13f, 8.13f, 0.0f, false, false, 1.95f, -0.24f)
                curveToRelative(21.21f, -5.3f, 40.35f, -24.6f, 46.53f, -46.93f)
                curveTo(190.58f, 90.78f, 183.9f, 68.59f, 165.66f, 50.34f)
                close()
            }
        }
        .build()
        return `_strategy-fill`!!
    }

private var `_strategy-fill`: ImageVector? = null
