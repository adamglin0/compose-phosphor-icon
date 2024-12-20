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

public val BoldGroup.FlagPennant: ImageVector
    get() {
        if (_flagPennant != null) {
            return _flagPennant!!
        }
        _flagPennant = Builder(name = "FlagPennant", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(243.94f, 92.67f)
                lineToRelative(-184.0f, -64.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 44.0f, 40.0f)
                verticalLineTo(216.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                verticalLineTo(176.53f)
                lineToRelative(175.94f, -61.2f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -22.66f)
                close()
                moveTo(68.0f, 151.12f)
                verticalLineTo(56.88f)
                lineTo(203.47f, 104.0f)
                close()
            }
        }
        .build()
        return _flagPennant!!
    }

private var _flagPennant: ImageVector? = null
