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

public val FillGroup.`Beach-ball-fill`: ImageVector
    get() {
        if (`_beach-ball-fill` != null) {
            return `_beach-ball-fill`!!
        }
        `_beach-ball-fill` = Builder(name = "Beach-ball-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 24.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f)
                arcTo(104.11f, 104.11f, 0.0f, false, false, 128.0f, 24.0f)
                close()
                moveTo(211.44f, 100.0f)
                arcTo(195.88f, 195.88f, 0.0f, false, false, 165.0f, 91.0f)
                arcTo(195.88f, 195.88f, 0.0f, false, false, 156.0f, 44.56f)
                arcTo(88.43f, 88.43f, 0.0f, false, true, 211.44f, 100.0f)
                close()
                moveTo(85.0f, 51.24f)
                arcToRelative(188.27f, 188.27f, 0.0f, false, true, 67.3f, 39.21f)
                arcTo(196.29f, 196.29f, 0.0f, false, false, 40.08f, 124.51f)
                arcTo(88.07f, 88.07f, 0.0f, false, true, 85.0f, 51.24f)
                close()
                moveTo(131.48f, 215.92f)
                arcToRelative(196.29f, 196.29f, 0.0f, false, false, 34.06f, -112.23f)
                arcTo(188.27f, 188.27f, 0.0f, false, true, 204.76f, 171.0f)
                arcTo(88.07f, 88.07f, 0.0f, false, true, 131.49f, 215.92f)
                close()
            }
        }
        .build()
        return `_beach-ball-fill`!!
    }

private var `_beach-ball-fill`: ImageVector? = null
