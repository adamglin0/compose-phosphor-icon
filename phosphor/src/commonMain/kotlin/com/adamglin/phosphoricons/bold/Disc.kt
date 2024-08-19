package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.Disc: ImageVector
    get() {
        if (_disc != null) {
            return _disc!!
        }
        _disc = Builder(name = "Disc", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 20.0f)
                arcTo(108.0f, 108.0f, 0.0f, true, false, 236.0f, 128.0f)
                arcTo(108.12f, 108.12f, 0.0f, false, false, 128.0f, 20.0f)
                close()
                moveTo(170.32f, 116.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, -3.91f, -9.44f)
                lineToRelative(28.84f, -28.84f)
                arcTo(83.55f, 83.55f, 0.0f, false, true, 211.13f, 116.0f)
                close()
                moveTo(148.0f, 128.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, -20.0f, -20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 148.0f, 128.0f)
                close()
                moveTo(128.0f, 212.0f)
                arcTo(84.0f, 84.0f, 0.0f, true, true, 178.28f, 60.75f)
                lineTo(149.43f, 89.59f)
                arcTo(44.0f, 44.0f, 0.0f, true, false, 170.32f, 140.0f)
                horizontalLineToRelative(40.81f)
                arcTo(84.12f, 84.12f, 0.0f, false, true, 128.0f, 212.0f)
                close()
            }
        }
        .build()
        return _disc!!
    }

private var _disc: ImageVector? = null
