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

public val FillGroup.Cellsignallow: ImageVector
    get() {
        if (_cellsignallow != null) {
            return _cellsignallow!!
        }
        _cellsignallow = Builder(name = "Cellsignallow", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(198.12f, 25.23f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -17.44f, 3.46f)
                lineToRelative(-160.0f, 160.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 32.0f, 216.0f)
                horizontalLineTo(192.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineTo(40.0f)
                arcTo(15.94f, 15.94f, 0.0f, false, false, 198.12f, 25.23f)
                close()
                moveTo(192.0f, 200.0f)
                horizontalLineTo(88.0f)
                verticalLineTo(144.0f)
                lineTo(192.0f, 40.0f)
                close()
            }
        }
        .build()
        return _cellsignallow!!
    }

private var _cellsignallow: ImageVector? = null
