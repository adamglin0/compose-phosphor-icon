package com.adamglin.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.LightGroup

public val LightGroup.GenderMale: ImageVector
    get() {
        if (_genderMale != null) {
            return _genderMale!!
        }
        _genderMale = Builder(name = "GenderMale", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 34.0f)
                horizontalLineTo(168.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(33.52f)
                lineTo(154.72f, 92.79f)
                arcToRelative(78.0f, 78.0f, 0.0f, true, false, 4.42f, 114.4f)
                horizontalLineToRelative(0.0f)
                arcToRelative(78.11f, 78.11f, 0.0f, false, false, 4.07f, -105.91f)
                lineTo(210.0f, 54.49f)
                verticalLineTo(88.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                verticalLineTo(40.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 216.0f, 34.0f)
                close()
                moveTo(150.66f, 198.7f)
                arcToRelative(66.0f, 66.0f, 0.0f, true, true, 0.0f, -93.36f)
                arcTo(66.1f, 66.1f, 0.0f, false, true, 150.66f, 198.7f)
                close()
            }
        }
        .build()
        return _genderMale!!
    }

private var _genderMale: ImageVector? = null
