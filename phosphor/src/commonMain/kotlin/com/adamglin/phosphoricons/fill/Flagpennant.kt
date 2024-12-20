package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.FlagPennant: ImageVector
    get() {
        if (_flagPennant != null) {
            return _flagPennant!!
        }
        _flagPennant = Builder(name = "FlagPennant", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.0f, 104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.37f, 7.56f)
                lineTo(64.0f, 173.69f)
                verticalLineTo(216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                verticalLineTo(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 10.63f, -7.56f)
                lineToRelative(184.0f, 64.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 248.0f, 104.0f)
                close()
            }
        }
        .build()
        return _flagPennant!!
    }

private var _flagPennant: ImageVector? = null
