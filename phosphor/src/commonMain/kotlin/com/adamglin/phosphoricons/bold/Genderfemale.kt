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

public val BoldGroup.Genderfemale: ImageVector
    get() {
        if (_genderfemale != null) {
            return _genderfemale!!
        }
        _genderfemale = Builder(name = "Genderfemale", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(212.0f, 96.0f)
                arcToRelative(84.0f, 84.0f, 0.0f, true, false, -96.0f, 83.13f)
                verticalLineTo(196.0f)
                horizontalLineTo(88.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(28.0f)
                verticalLineToRelative(20.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                verticalLineTo(220.0f)
                horizontalLineToRelative(28.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                horizontalLineTo(140.0f)
                verticalLineTo(179.13f)
                arcTo(84.12f, 84.12f, 0.0f, false, false, 212.0f, 96.0f)
                close()
                moveTo(68.0f, 96.0f)
                arcToRelative(60.0f, 60.0f, 0.0f, true, true, 60.0f, 60.0f)
                arcTo(60.07f, 60.07f, 0.0f, false, true, 68.0f, 96.0f)
                close()
            }
        }
        .build()
        return _genderfemale!!
    }

private var _genderfemale: ImageVector? = null
