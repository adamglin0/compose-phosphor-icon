package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.Flagpennant: ImageVector
    get() {
        if (_flagpennant != null) {
            return _flagpennant!!
        }
        _flagpennant = Builder(name = "Flagpennant", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(241.31f, 100.22f)
                lineToRelative(-184.0f, -64.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 52.0f, 40.0f)
                verticalLineTo(216.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                verticalLineTo(170.84f)
                lineToRelative(181.31f, -63.06f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -7.56f)
                close()
                moveTo(60.0f, 162.37f)
                verticalLineTo(45.63f)
                lineTo(227.82f, 104.0f)
                close()
            }
        }
        .build()
        return _flagpennant!!
    }

private var _flagpennant: ImageVector? = null
