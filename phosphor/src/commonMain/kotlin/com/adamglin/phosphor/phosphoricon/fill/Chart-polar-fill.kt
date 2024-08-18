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

public val FillGroup.`Chart-polar-fill`: ImageVector
    get() {
        if (`_chart-polar-fill` != null) {
            return `_chart-polar-fill`!!
        }
        `_chart-polar-fill` = Builder(name = "Chart-polar-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(120.0f, 199.54f)
                verticalLineToRelative(27.74f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.46f, 4.0f)
                arcToRelative(104.22f, 104.22f, 0.0f, false, true, -90.8f, -90.8f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.46f)
                lineTo(56.46f, 136.02f)
                arcTo(72.11f, 72.11f, 0.0f, false, false, 120.0f, 199.54f)
                close()
                moveTo(183.42f, 136.0f)
                lineTo(136.0f, 136.0f)
                verticalLineToRelative(47.42f)
                arcTo(56.11f, 56.11f, 0.0f, false, false, 183.42f, 136.0f)
                close()
                moveTo(136.0f, 72.58f)
                lineTo(136.0f, 120.0f)
                horizontalLineToRelative(47.42f)
                arcTo(56.11f, 56.11f, 0.0f, false, false, 136.0f, 72.58f)
                close()
                moveTo(227.28f, 136.0f)
                lineTo(199.54f, 136.0f)
                arcTo(72.11f, 72.11f, 0.0f, false, true, 136.0f, 199.54f)
                verticalLineToRelative(27.74f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.46f, 4.0f)
                arcToRelative(104.22f, 104.22f, 0.0f, false, false, 90.8f, -90.8f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 227.28f, 136.0f)
                close()
                moveTo(199.54f, 120.0f)
                horizontalLineToRelative(27.74f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.46f)
                arcToRelative(104.22f, 104.22f, 0.0f, false, false, -90.8f, -90.8f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.46f, 4.0f)
                lineTo(136.02f, 56.46f)
                arcTo(72.11f, 72.11f, 0.0f, false, true, 199.54f, 120.0f)
                close()
                moveTo(115.54f, 24.74f)
                arcToRelative(104.22f, 104.22f, 0.0f, false, false, -90.8f, 90.8f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.46f)
                lineTo(56.46f, 120.0f)
                arcTo(72.11f, 72.11f, 0.0f, false, true, 120.0f, 56.46f)
                lineTo(120.0f, 28.72f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 115.54f, 24.74f)
                close()
                moveTo(72.58f, 120.0f)
                lineTo(120.0f, 120.0f)
                lineTo(120.0f, 72.58f)
                arcTo(56.11f, 56.11f, 0.0f, false, false, 72.58f, 120.0f)
                close()
                moveTo(120.0f, 183.42f)
                lineTo(120.0f, 136.0f)
                lineTo(72.58f, 136.0f)
                arcTo(56.11f, 56.11f, 0.0f, false, false, 120.0f, 183.42f)
                close()
            }
        }
        .build()
        return `_chart-polar-fill`!!
    }

private var `_chart-polar-fill`: ImageVector? = null
