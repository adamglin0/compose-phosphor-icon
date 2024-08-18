package com.adamglin.phosphor.phosphoricon.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphor.phosphoricon.RegularGroup

public val RegularGroup.`Flip-horizontal`: ImageVector
    get() {
        if (`_flip-horizontal` != null) {
            return `_flip-horizontal`!!
        }
        `_flip-horizontal` = Builder(name = "Flip-horizontal", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(107.18f, 24.33f)
                arcToRelative(15.86f, 15.86f, 0.0f, false, false, -17.92f, 9.45f)
                lineToRelative(-0.06f, 0.14f)
                lineToRelative(-64.0f, 159.93f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 40.0f, 216.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(120.0f, 40.0f)
                arcTo(15.85f, 15.85f, 0.0f, false, false, 107.18f, 24.33f)
                close()
                moveTo(104.0f, 200.0f)
                lineTo(40.0f, 200.0f)
                lineToRelative(0.06f, -0.15f)
                lineTo(104.0f, 40.0f)
                close()
                moveTo(230.77f, 193.85f)
                lineTo(166.77f, 33.92f)
                lineTo(166.71f, 33.78f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 136.0f, 40.0f)
                lineTo(136.0f, 200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 14.78f, -22.15f)
                close()
                moveTo(152.0f, 200.0f)
                lineTo(152.0f, 40.0f)
                lineToRelative(63.93f, 159.84f)
                lineToRelative(0.06f, 0.15f)
                close()
            }
        }
        .build()
        return `_flip-horizontal`!!
    }

private var `_flip-horizontal`: ImageVector? = null
