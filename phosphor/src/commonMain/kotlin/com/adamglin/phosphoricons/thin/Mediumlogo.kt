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

public val ThinGroup.Mediumlogo: ImageVector
    get() {
        if (_mediumlogo != null) {
            return _mediumlogo!!
        }
        _mediumlogo = Builder(name = "Mediumlogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(72.0f, 68.0f)
                arcToRelative(60.0f, 60.0f, 0.0f, true, false, 60.0f, 60.0f)
                arcTo(60.07f, 60.07f, 0.0f, false, false, 72.0f, 68.0f)
                close()
                moveTo(72.0f, 180.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, true, true, 52.0f, -52.0f)
                arcTo(52.06f, 52.06f, 0.0f, false, true, 72.0f, 180.0f)
                close()
                moveTo(184.0f, 68.0f)
                curveToRelative(-16.0f, 0.0f, -28.0f, 25.79f, -28.0f, 60.0f)
                reflectiveCurveToRelative(12.0f, 60.0f, 28.0f, 60.0f)
                reflectiveCurveToRelative(28.0f, -25.79f, 28.0f, -60.0f)
                reflectiveCurveTo(200.0f, 68.0f, 184.0f, 68.0f)
                close()
                moveTo(184.0f, 180.0f)
                curveToRelative(-9.46f, 0.0f, -20.0f, -21.36f, -20.0f, -52.0f)
                reflectiveCurveToRelative(10.54f, -52.0f, 20.0f, -52.0f)
                reflectiveCurveToRelative(20.0f, 21.36f, 20.0f, 52.0f)
                reflectiveCurveTo(193.46f, 180.0f, 184.0f, 180.0f)
                close()
                moveTo(244.0f, 72.0f)
                lineTo(244.0f, 184.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(236.0f, 72.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                close()
            }
        }
        .build()
        return _mediumlogo!!
    }

private var _mediumlogo: ImageVector? = null
