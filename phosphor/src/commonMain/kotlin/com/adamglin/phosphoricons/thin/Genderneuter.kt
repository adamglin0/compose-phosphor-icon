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

public val ThinGroup.Genderneuter: ImageVector
    get() {
        if (_genderneuter != null) {
            return _genderneuter!!
        }
        _genderneuter = Builder(name = "Genderneuter", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(204.0f, 104.0f)
                arcToRelative(76.0f, 76.0f, 0.0f, true, false, -80.0f, 75.89f)
                lineTo(124.0f, 232.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(132.0f, 179.89f)
                arcTo(76.09f, 76.09f, 0.0f, false, false, 204.0f, 104.0f)
                close()
                moveTo(128.0f, 172.0f)
                arcToRelative(68.0f, 68.0f, 0.0f, true, true, 68.0f, -68.0f)
                arcTo(68.07f, 68.07f, 0.0f, false, true, 128.0f, 172.0f)
                close()
            }
        }
        .build()
        return _genderneuter!!
    }

private var _genderneuter: ImageVector? = null
