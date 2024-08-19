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

public val FillGroup.Numbercirclesix: ImageVector
    get() {
        if (_numbercirclesix != null) {
            return _numbercirclesix!!
        }
        _numbercirclesix = Builder(name = "Numbercirclesix", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(148.0f, 148.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, -20.0f, -20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 148.0f, 148.0f)
                close()
                moveTo(232.0f, 128.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, true, 128.0f, 24.0f)
                arcTo(104.11f, 104.11f, 0.0f, false, true, 232.0f, 128.0f)
                close()
                moveTo(164.0f, 148.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, -36.0f, -36.0f)
                curveToRelative(-0.61f, 0.0f, -1.22f, 0.0f, -1.82f, 0.0f)
                lineTo(142.87f, 84.1f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -13.74f, -8.2f)
                reflectiveCurveToRelative(-32.4f, 54.28f, -32.47f, 54.42f)
                arcTo(36.0f, 36.0f, 0.0f, true, false, 164.0f, 148.0f)
                close()
            }
        }
        .build()
        return _numbercirclesix!!
    }

private var _numbercirclesix: ImageVector? = null
