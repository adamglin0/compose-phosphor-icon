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

public val BoldGroup.CodeSimple: ImageVector
    get() {
        if (_codeSimple != null) {
            return _codeSimple!!
        }
        _codeSimple = Builder(name = "CodeSimple", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(96.0f, 73.0f)
                lineTo(34.06f, 128.0f)
                lineTo(96.0f, 183.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, true, 80.0f, 201.0f)
                lineTo(8.0f, 137.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 8.0f, 119.0f)
                lineTo(80.0f, 55.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 96.0f, 73.0f)
                close()
                moveTo(248.0f, 119.0f)
                lineTo(176.0f, 55.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, false, 160.0f, 73.0f)
                lineToRelative(61.91f, 55.0f)
                lineTo(160.0f, 183.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, false, 176.0f, 201.0f)
                lineToRelative(72.0f, -64.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 248.0f, 119.0f)
                close()
            }
        }
        .build()
        return _codeSimple!!
    }

private var _codeSimple: ImageVector? = null
