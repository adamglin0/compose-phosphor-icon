package com.adamglin.phosphoricon.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.BoldGroup

public val BoldGroup.`User-bold`: ImageVector
    get() {
        if (`_user-bold` != null) {
            return `_user-bold`!!
        }
        `_user-bold` = Builder(name = "User-bold", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(234.38f, 210.0f)
                arcToRelative(123.36f, 123.36f, 0.0f, false, false, -60.78f, -53.23f)
                arcToRelative(76.0f, 76.0f, 0.0f, true, false, -91.2f, 0.0f)
                arcTo(123.36f, 123.36f, 0.0f, false, false, 21.62f, 210.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 20.77f, 12.0f)
                curveToRelative(18.12f, -31.32f, 50.12f, -50.0f, 85.61f, -50.0f)
                reflectiveCurveToRelative(67.49f, 18.69f, 85.61f, 50.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 20.77f, -12.0f)
                close()
                moveTo(76.0f, 96.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, true, true, 52.0f, 52.0f)
                arcTo(52.06f, 52.06f, 0.0f, false, true, 76.0f, 96.0f)
                close()
            }
        }
        .build()
        return `_user-bold`!!
    }

private var `_user-bold`: ImageVector? = null
