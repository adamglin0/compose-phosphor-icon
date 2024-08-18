package com.adamglin.phosphor.phosphoricon.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphor.phosphoricon.FillGroup

public val FillGroup.`Eye-slash-fill`: ImageVector
    get() {
        if (`_eye-slash-fill` != null) {
            return `_eye-slash-fill`!!
        }
        `_eye-slash-fill` = Builder(name = "Eye-slash-fill", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(96.68f, 57.87f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.08f, -6.6f)
                arcTo(130.13f, 130.13f, 0.0f, false, true, 128.0f, 48.0f)
                curveToRelative(34.88f, 0.0f, 66.57f, 13.26f, 91.66f, 38.35f)
                curveToRelative(18.83f, 18.83f, 27.3f, 37.62f, 27.65f, 38.41f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 6.5f)
                curveToRelative(-0.35f, 0.79f, -8.82f, 19.57f, -27.65f, 38.4f)
                quadToRelative(-4.28f, 4.26f, -8.79f, 8.07f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.55f, -0.36f)
                close()
                moveTo(213.92f, 210.62f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -11.84f, 10.76f)
                lineTo(180.0f, 197.13f)
                arcTo(127.21f, 127.21f, 0.0f, false, true, 128.0f, 208.0f)
                curveToRelative(-34.88f, 0.0f, -66.57f, -13.26f, -91.66f, -38.34f)
                curveTo(17.51f, 150.83f, 9.0f, 132.05f, 8.69f, 131.26f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -6.5f)
                curveTo(9.0f, 124.0f, 17.51f, 105.18f, 36.34f, 86.35f)
                arcToRelative(135.0f, 135.0f, 0.0f, false, true, 25.0f, -19.78f)
                lineTo(42.08f, 45.38f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 53.92f, 34.62f)
                close()
                moveTo(148.43f, 162.37f)
                lineTo(95.74f, 104.37f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 52.69f, 58.0f)
                close()
            }
        }
        .build()
        return `_eye-slash-fill`!!
    }

private var `_eye-slash-fill`: ImageVector? = null
