package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.PersonSimpleCircle: ImageVector
    get() {
        if (_personSimpleCircle != null) {
            return _personSimpleCircle!!
        }
        _personSimpleCircle = Builder(name = "PersonSimpleCircle", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 28.0f)
                arcTo(100.0f, 100.0f, 0.0f, true, false, 228.0f, 128.0f)
                arcTo(100.11f, 100.11f, 0.0f, false, false, 128.0f, 28.0f)
                close()
                moveTo(128.0f, 220.0f)
                arcToRelative(92.0f, 92.0f, 0.0f, true, true, 92.0f, -92.0f)
                arcTo(92.1f, 92.1f, 0.0f, false, true, 128.0f, 220.0f)
                close()
                moveTo(116.0f, 80.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 116.0f, 80.0f)
                close()
                moveTo(180.0f, 112.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(132.0f, 116.0f)
                verticalLineToRelative(18.79f)
                lineToRelative(31.33f, 47.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -6.66f, 4.44f)
                lineToRelative(-28.67f, -43.0f)
                lineToRelative(-28.67f, 43.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -6.66f, -4.44f)
                lineToRelative(31.33f, -47.0f)
                lineTo(124.0f, 116.0f)
                lineTo(80.0f, 116.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(96.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 180.0f, 112.0f)
                close()
            }
        }
        .build()
        return _personSimpleCircle!!
    }

private var _personSimpleCircle: ImageVector? = null
