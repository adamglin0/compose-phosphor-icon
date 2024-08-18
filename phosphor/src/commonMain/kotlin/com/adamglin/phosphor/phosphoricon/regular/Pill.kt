package com.adamglin.phosphor.phosphoricon.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphor.phosphoricon.RegularGroup

public val RegularGroup.Pill: ImageVector
    get() {
        if (_pill != null) {
            return _pill!!
        }
        _pill = Builder(name = "Pill", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.42f, 39.6f)
                arcToRelative(53.26f, 53.26f, 0.0f, false, false, -75.32f, 0.0f)
                lineTo(39.6f, 141.09f)
                arcToRelative(53.26f, 53.26f, 0.0f, false, false, 75.32f, 75.31f)
                horizontalLineToRelative(0.0f)
                lineTo(216.43f, 114.91f)
                arcTo(53.31f, 53.31f, 0.0f, false, false, 216.42f, 39.6f)
                close()
                moveTo(103.61f, 205.09f)
                horizontalLineToRelative(0.0f)
                arcToRelative(37.26f, 37.26f, 0.0f, false, true, -52.7f, -52.69f)
                lineTo(96.0f, 107.31f)
                lineTo(148.7f, 160.0f)
                close()
                moveTo(205.11f, 103.6f)
                lineTo(160.0f, 148.69f)
                lineTo(107.32f, 96.0f)
                lineToRelative(45.1f, -45.09f)
                arcToRelative(37.26f, 37.26f, 0.0f, false, true, 52.69f, 52.69f)
                close()
                moveTo(189.68f, 82.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 11.32f)
                lineToRelative(-24.0f, 24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -11.31f, -11.32f)
                lineToRelative(24.0f, -24.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 189.68f, 82.34f)
                close()
            }
        }
        .build()
        return _pill!!
    }

private var _pill: ImageVector? = null
