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

public val FillGroup.`Paper-plane-fill`: ImageVector
    get() {
        if (`_paper-plane-fill` != null) {
            return `_paper-plane-fill`!!
        }
        `_paper-plane-fill` = Builder(name = "Paper-plane-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.2f, 218.31f)
                arcTo(15.88f, 15.88f, 0.0f, false, true, 224.0f, 224.0f)
                arcToRelative(16.22f, 16.22f, 0.0f, false, true, -5.37f, -0.92f)
                lineToRelative(-79.95f, -27.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.72f, -3.79f)
                verticalLineTo(120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.53f, -8.0f)
                arcToRelative(8.19f, 8.19f, 0.0f, false, false, -7.47f, 8.26f)
                verticalLineToRelative(72.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.72f, 3.79f)
                lineToRelative(-79.95f, 27.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -19.26f, -22.92f)
                lineTo(114.0f, 32.13f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 27.89f, 0.0f)
                lineTo(237.9f, 200.1f)
                arcTo(15.89f, 15.89f, 0.0f, false, true, 236.2f, 218.31f)
                close()
            }
        }
        .build()
        return `_paper-plane-fill`!!
    }

private var `_paper-plane-fill`: ImageVector? = null
