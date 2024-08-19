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

public val BoldGroup.`Align-left-simple-bold`: ImageVector
    get() {
        if (`_align-left-simple-bold` != null) {
            return `_align-left-simple-bold`!!
        }
        `_align-left-simple-bold` = Builder(name = "Align-left-simple-bold", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(44.0f, 56.0f)
                lineTo(44.0f, 200.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(20.0f, 56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                close()
                moveTo(244.0f, 96.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, 20.0f)
                lineTo(80.0f, 180.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, -20.0f)
                lineTo(60.0f, 96.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 80.0f, 76.0f)
                lineTo(224.0f, 76.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 244.0f, 96.0f)
                close()
                moveTo(220.0f, 100.0f)
                lineTo(84.0f, 100.0f)
                verticalLineToRelative(56.0f)
                lineTo(220.0f, 156.0f)
                close()
            }
        }
        .build()
        return `_align-left-simple-bold`!!
    }

private var `_align-left-simple-bold`: ImageVector? = null
