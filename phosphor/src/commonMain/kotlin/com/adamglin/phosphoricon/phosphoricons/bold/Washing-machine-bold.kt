package com.adamglin.phosphoricon.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.BoldGroup

public val BoldGroup.`Washing-machine-bold`: ImageVector
    get() {
        if (`_washing-machine-bold` != null) {
            return `_washing-machine-bold`!!
        }
        `_washing-machine-bold` = Builder(name = "Washing-machine-bold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(160.0f, 80.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 160.0f, 80.0f)
                close()
                moveTo(232.0f, 44.0f)
                lineTo(232.0f, 212.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, 20.0f)
                lineTo(44.0f, 232.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, -20.0f)
                lineTo(24.0f, 44.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 44.0f, 24.0f)
                lineTo(212.0f, 24.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 232.0f, 44.0f)
                close()
                moveTo(208.0f, 48.0f)
                lineTo(48.0f, 48.0f)
                lineTo(48.0f, 208.0f)
                lineTo(208.0f, 208.0f)
                close()
                moveTo(139.51f, 123.51f)
                lineTo(123.51f, 139.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, 17.0f)
                lineToRelative(16.0f, -16.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -17.0f, -17.0f)
                close()
                moveTo(124.51f, 107.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 0.0f)
                lineToRelative(-8.0f, 8.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, 17.0f)
                lineToRelative(8.0f, -8.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 124.49f, 107.51f)
                close()
                moveTo(128.0f, 196.0f)
                arcToRelative(68.05f, 68.05f, 0.0f, false, false, 67.19f, -78.52f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -23.72f, 3.69f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, true, -36.64f, -36.64f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 3.69f, -23.72f)
                arcTo(68.0f, 68.0f, 0.0f, true, false, 128.0f, 196.0f)
                close()
            }
        }
        .build()
        return `_washing-machine-bold`!!
    }

private var `_washing-machine-bold`: ImageVector? = null
