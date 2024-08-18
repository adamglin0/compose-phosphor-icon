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

public val FillGroup.`Exclude-fill`: ImageVector
    get() {
        if (`_exclude-fill` != null) {
            return `_exclude-fill`!!
        }
        `_exclude-fill` = Builder(name = "Exclude-fill", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 160.0f)
                arcTo(80.0f, 80.0f, 0.0f, false, true, 81.36f, 174.64f)
                arcToRelative(80.0f, 80.0f, 0.0f, false, false, 93.28f, -93.28f)
                arcTo(80.0f, 80.0f, 0.0f, false, true, 240.0f, 160.0f)
                close()
                moveTo(160.0f, 80.0f)
                arcToRelative(80.29f, 80.29f, 0.0f, false, true, 14.64f, 1.36f)
                arcToRelative(80.0f, 80.0f, 0.0f, true, false, -93.28f, 93.28f)
                arcTo(80.0f, 80.0f, 0.0f, false, true, 160.0f, 80.0f)
                close()
            }
        }
        .build()
        return `_exclude-fill`!!
    }

private var `_exclude-fill`: ImageVector? = null
