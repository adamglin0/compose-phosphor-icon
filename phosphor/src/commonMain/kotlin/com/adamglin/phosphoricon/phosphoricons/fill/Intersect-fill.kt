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

public val FillGroup.`Intersect-fill`: ImageVector
    get() {
        if (`_intersect-fill` != null) {
            return `_intersect-fill`!!
        }
        `_intersect-fill` = Builder(name = "Intersect-fill", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(174.63f, 81.37f)
                arcToRelative(80.0f, 80.0f, 0.0f, true, false, -93.26f, 93.26f)
                arcToRelative(80.0f, 80.0f, 0.0f, true, false, 93.26f, -93.26f)
                close()
                moveTo(32.0f, 96.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, true, 126.0f, -16.0f)
                arcTo(80.08f, 80.08f, 0.0f, false, false, 80.05f, 158.0f)
                arcTo(64.11f, 64.11f, 0.0f, false, true, 32.0f, 96.0f)
                close()
                moveTo(160.0f, 224.0f)
                arcTo(64.11f, 64.11f, 0.0f, false, true, 98.0f, 176.0f)
                arcTo(80.08f, 80.08f, 0.0f, false, false, 176.0f, 98.0f)
                arcTo(64.0f, 64.0f, 0.0f, false, true, 160.0f, 224.0f)
                close()
            }
        }
        .build()
        return `_intersect-fill`!!
    }

private var `_intersect-fill`: ImageVector? = null
