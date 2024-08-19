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

public val BoldGroup.Numbercirclenine: ImageVector
    get() {
        if (_numbercirclenine != null) {
            return _numbercirclenine!!
        }
        _numbercirclenine = Builder(name = "Numbercirclenine", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
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
                moveTo(148.0f, 73.36f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, -25.06f, 74.32f)
                lineTo(109.7f, 169.85f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 20.6f, 12.3f)
                lineTo(162.64f, 128.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, false, 148.0f, 73.36f)
                close()
                moveTo(141.86f, 116.0f)
                lineToRelative(0.0f, 0.0f)
                arcTo(16.0f, 16.0f, 0.0f, true, true, 136.0f, 94.14f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 141.84f, 116.0f)
                close()
            }
        }
        .build()
        return _numbercirclenine!!
    }

private var _numbercirclenine: ImageVector? = null
