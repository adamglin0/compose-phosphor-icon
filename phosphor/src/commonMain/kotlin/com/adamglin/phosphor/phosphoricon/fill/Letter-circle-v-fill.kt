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

public val FillGroup.`Letter-circle-v-fill`: ImageVector
    get() {
        if (`_letter-circle-v-fill` != null) {
            return `_letter-circle-v-fill`!!
        }
        `_letter-circle-v-fill` = Builder(name = "Letter-circle-v-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 24.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f)
                arcTo(104.11f, 104.11f, 0.0f, false, false, 128.0f, 24.0f)
                close()
                moveTo(167.43f, 99.0f)
                lineTo(135.43f, 179.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -14.86f, 0.0f)
                lineToRelative(-32.0f, -80.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 103.43f, 93.0f)
                lineTo(128.0f, 154.46f)
                lineTo(152.57f, 93.0f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 167.43f, 99.0f)
                close()
            }
        }
        .build()
        return `_letter-circle-v-fill`!!
    }

private var `_letter-circle-v-fill`: ImageVector? = null
