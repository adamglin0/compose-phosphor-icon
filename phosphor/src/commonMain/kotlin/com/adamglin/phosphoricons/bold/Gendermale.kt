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

public val BoldGroup.GenderMale: ImageVector
    get() {
        if (_genderMale != null) {
            return _genderMale!!
        }
        _genderMale = Builder(name = "GenderMale", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 28.0f)
                horizontalLineTo(168.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(19.0f)
                lineTo(154.28f, 84.74f)
                arcToRelative(84.0f, 84.0f, 0.0f, true, false, 17.0f, 17.0f)
                lineTo(204.0f, 69.0f)
                verticalLineTo(88.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                verticalLineTo(40.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 216.0f, 28.0f)
                close()
                moveTo(146.41f, 194.46f)
                arcToRelative(60.0f, 60.0f, 0.0f, true, true, 0.0f, -84.87f)
                arcTo(60.1f, 60.1f, 0.0f, false, true, 146.41f, 194.46f)
                close()
            }
        }
        .build()
        return _genderMale!!
    }

private var _genderMale: ImageVector? = null
