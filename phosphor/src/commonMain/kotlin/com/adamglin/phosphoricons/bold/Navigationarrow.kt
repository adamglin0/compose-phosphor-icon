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

public val BoldGroup.Navigationarrow: ImageVector
    get() {
        if (_navigationarrow != null) {
            return _navigationarrow!!
        }
        _navigationarrow = Builder(name = "Navigationarrow", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(238.7f, 102.46f)
                lineTo(62.81f, 37.21f)
                lineToRelative(-0.25f, -0.09f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 37.12f, 62.56f)
                lineToRelative(0.09f, 0.25f)
                lineTo(102.46f, 238.7f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 121.3f, 252.0f)
                horizontalLineToRelative(0.35f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 18.77f, -14.12f)
                lineToRelative(0.09f, -0.29f)
                lineToRelative(21.23f, -75.85f)
                lineToRelative(75.85f, -21.23f)
                lineToRelative(0.29f, -0.09f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 0.82f, -38.0f)
                close()
                moveTo(148.77f, 140.46f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -8.32f, 8.32f)
                lineToRelative(-19.68f, 70.29f)
                lineTo(62.8f, 62.8f)
                lineToRelative(156.26f, 58.0f)
                close()
            }
        }
        .build()
        return _navigationarrow!!
    }

private var _navigationarrow: ImageVector? = null
