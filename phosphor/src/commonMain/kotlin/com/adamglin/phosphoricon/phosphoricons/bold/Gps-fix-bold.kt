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

public val BoldGroup.`Gps-fix-bold`: ImageVector
    get() {
        if (`_gps-fix-bold` != null) {
            return `_gps-fix-bold`!!
        }
        `_gps-fix-bold` = Builder(name = "Gps-fix-bold", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 116.0f)
                lineTo(219.22f, 116.0f)
                arcTo(92.21f, 92.21f, 0.0f, false, false, 140.0f, 36.78f)
                lineTo(140.0f, 16.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                lineTo(116.0f, 36.78f)
                arcTo(92.21f, 92.21f, 0.0f, false, false, 36.78f, 116.0f)
                lineTo(16.0f, 116.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                lineTo(36.78f, 140.0f)
                arcTo(92.21f, 92.21f, 0.0f, false, false, 116.0f, 219.22f)
                lineTo(116.0f, 240.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(140.0f, 219.22f)
                arcTo(92.21f, 92.21f, 0.0f, false, false, 219.22f, 140.0f)
                lineTo(240.0f, 140.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(128.0f, 196.0f)
                arcToRelative(68.0f, 68.0f, 0.0f, true, true, 68.0f, -68.0f)
                arcTo(68.07f, 68.07f, 0.0f, false, true, 128.0f, 196.0f)
                close()
                moveTo(128.0f, 84.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, false, 44.0f, 44.0f)
                arcTo(44.05f, 44.05f, 0.0f, false, false, 128.0f, 84.0f)
                close()
                moveTo(128.0f, 148.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 128.0f, 148.0f)
                close()
            }
        }
        .build()
        return `_gps-fix-bold`!!
    }

private var `_gps-fix-bold`: ImageVector? = null
