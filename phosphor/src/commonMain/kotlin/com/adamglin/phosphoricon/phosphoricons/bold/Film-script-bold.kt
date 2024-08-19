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

public val BoldGroup.`Film-script-bold`: ImageVector
    get() {
        if (`_film-script-bold` != null) {
            return `_film-script-bold`!!
        }
        `_film-script-bold` = Builder(name = "Film-script-bold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 20.0f)
                lineTo(56.0f, 20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 36.0f, 40.0f)
                lineTo(36.0f, 216.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(200.0f, 236.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(220.0f, 40.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 200.0f, 20.0f)
                close()
                moveTo(196.0f, 212.0f)
                lineTo(60.0f, 212.0f)
                lineTo(60.0f, 44.0f)
                lineTo(196.0f, 44.0f)
                close()
                moveTo(76.0f, 80.0f)
                arcTo(16.0f, 16.0f, 0.0f, true, true, 92.0f, 96.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 76.0f, 80.0f)
                close()
                moveTo(76.0f, 176.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 76.0f, 176.0f)
                close()
                moveTo(76.0f, 128.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 76.0f, 128.0f)
                close()
            }
        }
        .build()
        return `_film-script-bold`!!
    }

private var `_film-script-bold`: ImageVector? = null
