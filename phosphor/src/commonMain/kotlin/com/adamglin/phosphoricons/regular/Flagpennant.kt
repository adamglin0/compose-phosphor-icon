package com.adamglin.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.RegularGroup

public val RegularGroup.Flagpennant: ImageVector
    get() {
        if (_flagpennant != null) {
            return _flagpennant!!
        }
        _flagpennant = Builder(name = "Flagpennant", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(242.63f, 96.44f)
                lineToRelative(-184.0f, -64.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 48.0f, 40.0f)
                verticalLineTo(216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                verticalLineTo(173.69f)
                lineToRelative(178.63f, -62.13f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -15.12f)
                close()
                moveTo(64.0f, 156.75f)
                verticalLineTo(51.25f)
                lineTo(215.65f, 104.0f)
                close()
            }
        }
        .build()
        return _flagpennant!!
    }

private var _flagpennant: ImageVector? = null
