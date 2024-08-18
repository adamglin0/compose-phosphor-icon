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

public val FillGroup.`Diamond-fill`: ImageVector
    get() {
        if (`_diamond-fill` != null) {
            return `_diamond-fill`!!
        }
        `_diamond-fill` = Builder(name = "Diamond-fill", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 128.0f)
                arcToRelative(15.85f, 15.85f, 0.0f, false, true, -4.67f, 11.28f)
                lineToRelative(-96.05f, 96.06f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -22.56f, 0.0f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-96.0f, -96.06f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 0.0f, -22.56f)
                lineToRelative(96.05f, -96.06f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 22.56f, 0.0f)
                lineToRelative(96.05f, 96.06f)
                arcTo(15.85f, 15.85f, 0.0f, false, true, 240.0f, 128.0f)
                close()
            }
        }
        .build()
        return `_diamond-fill`!!
    }

private var `_diamond-fill`: ImageVector? = null
