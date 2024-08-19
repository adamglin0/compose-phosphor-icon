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

public val BoldGroup.Numbercircletwo: ImageVector
    get() {
        if (_numbercircletwo != null) {
            return _numbercircletwo!!
        }
        _numbercircletwo = Builder(name = "Numbercircletwo", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 20.0f)
                arcTo(108.0f, 108.0f, 0.0f, true, false, 236.0f, 128.0f)
                arcTo(108.12f, 108.12f, 0.0f, false, false, 128.0f, 20.0f)
                close()
                moveTo(128.0f, 212.0f)
                arcToRelative(84.0f, 84.0f, 0.0f, true, true, 84.0f, -84.0f)
                arcTo(84.09f, 84.09f, 0.0f, false, true, 128.0f, 212.0f)
                close()
                moveTo(156.75f, 125.67f)
                lineTo(128.0f, 164.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                lineTo(104.0f, 188.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -9.6f, -19.2f)
                lineToRelative(43.17f, -57.56f)
                arcTo(12.0f, 12.0f, 0.0f, true, false, 116.68f, 100.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -22.63f, -8.0f)
                arcToRelative(36.3f, 36.3f, 0.0f, false, true, 5.2f, -9.67f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, 57.5f, 43.34f)
                close()
            }
        }
        .build()
        return _numbercircletwo!!
    }

private var _numbercircletwo: ImageVector? = null
