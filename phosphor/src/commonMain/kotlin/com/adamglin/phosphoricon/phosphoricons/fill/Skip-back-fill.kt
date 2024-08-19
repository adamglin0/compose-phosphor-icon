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

public val FillGroup.`Skip-back-fill`: ImageVector
    get() {
        if (`_skip-back-fill` != null) {
            return `_skip-back-fill`!!
        }
        `_skip-back-fill` = Builder(name = "Skip-back-fill", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 47.88f)
                verticalLineTo(208.12f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -24.43f, 13.43f)
                lineTo(64.0f, 146.77f)
                verticalLineTo(216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                verticalLineTo(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineToRelative(69.23f)
                lineTo(183.57f, 34.45f)
                arcTo(15.95f, 15.95f, 0.0f, false, true, 208.0f, 47.88f)
                close()
            }
        }
        .build()
        return `_skip-back-fill`!!
    }

private var `_skip-back-fill`: ImageVector? = null
